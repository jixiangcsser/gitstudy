package jixiang;

//import org.junit.Test;
//import org.mockito.*;
//import org.mockito.exceptions.verification.NoInteractionsWanted;
//import org.mockito.invocation.InvocationOnMock;
//import org.mockito.stubbing.Answer;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.util.*;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.mockito.Mockito.*;
//
//import static org.junit.Assert.*;
//
///**
// * Created by MyWorld on 2016/3/27.
// */
//public class MockitoDemo {
//    @Test
//    public void testListWithActualValue() {
//        List mock =mock(List.class);//模拟创建一个List对象
//        mock.add(1);
//        mock.clear();
//        verify(mock).add(1);
//        verify(mock).clear();
//
//    }
//    @Test
//    public void when_thenReturn(){
//        Iterator iterator =mock(Iterator.class);
//        //预设当iterator调用next()时第一次返回hello,第n次都返回world
//        when(iterator.next()).thenReturn("hello").thenReturn("world");
//        //使用mock的对象
//        String result=iterator.next()+" "+iterator.next()+" "+iterator.next();
//        //验证结果
//        assertEquals("hello world world",result);
//    }
//    @Test
//    public void when_thenThrow() throws IOException{
//        OutputStream outputStream=mock(OutputStream.class);
//        OutputStreamWriter writer=new OutputStreamWriter(outputStream);
//        //预设当流关闭时抛出异常
//        doThrow(new IOException()).when(outputStream).close();
//        outputStream.close();
//    }
//    @Test
//    public void with_arguments(){
//        Comparable comparable=mock(Comparable.class);
//        //预设根据不同的参数返回不同的结果
//        when(comparable.compareTo("Test")).thenReturn(1);
//        when(comparable.compareTo("Omg")).thenReturn(2);
//        assertEquals(1,comparable.compareTo("Test"));
//        assertEquals(2,comparable.compareTo("Omg"));
//        assertEquals(0,comparable.compareTo("No stub"));
//    }
//    @Test
//    public void with_unspecified_arguments(){
//        List list=mock(List.class);
//        when(list.get(anyInt())).thenReturn(1);
//        when(list.contains(argThat(new IsValid()))).thenReturn(true);
//        System.out.println(list.get(55));
//        assertEquals(1,list.get(1));
//        assertEquals(1,list.get(999));
//        assertTrue(list.contains(1));
//        assertTrue(list.contains(3));
//
//    }
//    private class IsValid extends ArgumentMatcher<List>{
//
//        public boolean matches(Object o) {
//            return o.equals(1) || o.equals(3);
//        }
//    }
//    @Test
//    public void all_arguments_provided_by_mathcers(){
//        Comparator comparator=mock(Comparator.class);
//        Comparator comparator1=new Comparator() {
//            public int compare(Object o1, Object o2) {
//                if(o1==o2){
//                    return 1;
//                }
//                else if(o1 instanceof String && o2 instanceof String){
//                    String o=(String)o2;
//                    if(((String)o1).equals(o)){
//                        return 1;
//                    }
//                    else return 0;
//                }else
//                    return 0;
//            }
//        };
//        System.out.println(comparator1.compare("hello","hello"));
//        System.out.println(comparator.compare("hello2","hello"));
//        //如果你使用了参数匹配，那么所有的参数都必须通过mathcers来匹配
//        System.out.println(verify(comparator).compare(anyString(),eq("hello")));
//        //下面的为无效的参数匹配使用
//        //verify(comparator).compare(anyString(),"hello");
//        Map mockedMap=mock(Map.class);
//        when(mockedMap.get("city")).thenReturn("广州");
//        Object cityValue=mockedMap.get("city");
//        assertThat(cityValue.toString(),is("广州"));
//    }
//    @Test
//    public void verifying_number_of_invocations() {
//        List list=mock(List.class);
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(3);
//        list.add(3);
//        //验证是否被调用且被调用一次，等效于下面的times(1)
//        verify(list).add(1);
//
//        //verify(list).add(2);
//        verify(list,times(1)).add(1);
//        //验证list.add(2)是否被调用了两次
//        verify(list,times(2)).add(2);
//        //验证是否从未被调用过。
//        verify(list,never()).add(4);
//        //验证list.add(2)是否至少被调用了两次
//        verify(list,atLeast(2)).add(2);
//        verify(list,atMost(2)).add(2);
//    }
//    @Test(expected = RuntimeException.class)
//    public void doThrow_when(){
//        List list=mock(List.class);
//        //如果list.add加的不是1就会报异常！
//        doThrow(new RuntimeException()).when(list).add(1);
//        list.add(2);
//    }
//    @Test
//    public void verification_in_order(){
//        List list=mock(List.class);
//        List list2=mock(List.class);
//        list.add(1);
//        list2.add("hello");
//        list.add(2);
//        list2.add("world");
//        //将需要排序的mock对象放入InOrder
//        InOrder inOrder= inOrder(list,list2);
//        inOrder.verify(list).add(1);
//        inOrder.verify(list2).add("hello");
//        inOrder.verify(list).add(2);
//        inOrder.verify(list2).add("world");
//    }
//    //7.确保模拟对象上无互动发生
//    @Test
//    public void verify_interation(){
//        List list=mock(List.class);
//        List list2=mock(List.class);
//        List list3=mock(List.class);
//        list.add(1);
//        verify(list).add(1);
//        verify(list,never()).add(2);
//        list2.add(2);
//
//        //list3.add(i);
//        //验证零互动行为
//        verifyZeroInteractions(list2,list3);
//    }
//    //8.找到冗余的互动（即未被验证到的）
//    @Test(expected = NoInteractionsWanted.class)
//    public void find_redundant_interaction(){
//        List list=mock(List.class);
//        list.add(1);
//        list.add(2);
//        verify(list,times(2)).add(anyInt());
//        verifyNoMoreInteractions(list);
//        List list2=mock(List.class);
//        list2.add(1);
//        list2.add(1);
//        verify(list2).add(1);
//        verifyNoMoreInteractions(list2);
//
//    }
//    //使用注解来快速模拟
//    @Mock
//    private List mocklist;
//    public MockitoDemo(){//构造函数初始化mock的代码
//        MockitoAnnotations.initMocks(this);
//    }
//    @Test
//    public void shorthand(){
//        mocklist.add(1);
//        verify(mocklist).add(1);
//    }
//    //10.连续调用
//    @Test(expected = RuntimeException.class)
//    public void consecutive_calls(){
//        //这里分开连续调用返回期望值，只有最后一个有效
//        when(mocklist.get(0)).thenReturn(0);
//        when(mocklist.get(0)).thenReturn(1);
//        when(mocklist.get(0)).thenReturn(2);
//        //连续的调用则会有所不同。
//        when(mocklist.get(1)).thenReturn(0).thenReturn(1).thenReturn(new RuntimeException());
//        System.out.println(mocklist.get(0));
//        System.out.println(mocklist.get(0));
//        System.out.println(mocklist.get(0));
//        assertEquals(2,mocklist.get(0));
//        assertEquals(2,mocklist.get(0));
//
//        assertEquals(0,mocklist.get(1));
//        assertEquals(1,mocklist.get(1));
//        mocklist.get(1);//第三次调用mocklist.get(1)就会抛出异常
//    }
//    //11。使用回掉生成期望值
//    @Test
//    public void answer_with_callback(){
//        when(mocklist.get(anyInt())).thenAnswer(new Answer<Object>() {
//            //使用answer来生成我们期望的返回
//            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
//                Object[] args= invocationOnMock.getArguments();
//                return "hello world:"+args[0];
//            }
//
//        });
//        assertEquals("hello world:0",mocklist.get(0));
//        assertEquals("hello world:999",mocklist.get(999));
//
//    }
//    //12.监控真实对象
//    @Test(expected = IndexOutOfBoundsException.class)
//    public void spy_on_real_objects(){
//
//        List list=new LinkedList();
//        List spy=spy(list);
//       // when(spy.get(0)).thenReturn(3);这里会出问题，因为会调用真是对象的get(0),所以会抛出越界异常
//        System.out.println("+++");
//        doReturn(999).when(spy).get(999); //这里就不会有问题
//        when(spy.size()).thenReturn(100);
//        spy.add(1);
//        spy.add(2);
//
//        assertEquals(100,spy.size());
//        assertEquals(1,spy.get(0));
//        assertEquals(2,spy.get(1));
//        verify(spy).add(1);
//        verify(spy).add(2);
//        assertEquals(999,spy.get(999));
//        spy.get(2);
//    }
//    //13.修改对未预设的调用返回默认期望值
//    @Test
//    public void unstubbed_invocations(){
//        List mock=mock(List.class, new Answer() {
//            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
//                return 998;
//            }
//        });
//        assertEquals(999,mock.get(1));
//        assertEquals(999,mock.size());
//    }
//
//    @Test
//    public void capturing_args(){
//        PersonDao personDao=mock(PersonDao.class);
//        PersonService personService=new PersonService(personDao);
//        ArgumentCaptor<Person> argument=ArgumentCaptor.forClass(Person.class);
//        personService.update(1,"jack");
//        verify(personDao).update(argument.capture());
//        assertEquals(1,argument.getValue().getId());
//        assertEquals("jack",argument.getValue().getName());
//
//    }
//    class Person{
//        private int id;
//        private String name;
//        Person(int id,String name){
//            this.id=id;
//            this.name=name;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//
//        public String getName() {
//            return name;
//        }
//    }
//    interface PersonDao{
//        public void update(Person person);
//    }
//    class PersonService{
//        private PersonDao personDao;
//        PersonService(PersonDao personDao){
//            this.personDao=personDao;
//        }
//        public void update(int id,String name){
//            personDao.update(new Person(id,name));
//        }
//    }
//    @Test
//    public void real_partial_mock(){
//        List list=spy(new ArrayList());
//        assertEquals(0,list.size());
//        A a=mck
//    }




//}
