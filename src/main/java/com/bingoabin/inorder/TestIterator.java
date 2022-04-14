package com.bingoabin.inorder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bingoabin
 * @date 2022/4/14 15:40
 */
public class TestIterator {

	@Test
	public void test1(){
		List<Object> coll = new ArrayList<>();
		coll.add(123);
		coll.add(456);
		coll.add(new Person("Jerry",20));
		coll.add("Tom");
		coll.add(false);

		//方式一：
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        //报异常：NoSuchElementException
//        System.out.println(iterator.next());

		//方式二：不推荐
//        for(int i = 0;i < coll.size();i++){
//            System.out.println(iterator.next());
//        }

		//方式三：推荐
		////hasNext():判断是否还有下一个元素
		for (Object o : coll) {
			//next():①指针下移 ②将下移以后集合位置上的元素返回
			System.out.println(o);
		}

	}

	@Test
	public void test2(){

		List<Object> coll = new ArrayList<>();
		coll.add(123);
		coll.add(456);
		coll.add(new Person("Jerry",20));
		coll.add("Tom");
		coll.add(false);

		//错误方式一：
//        Iterator iterator = coll.iterator();
//        while((iterator.next()) != null){
//            System.out.println(iterator.next());
//        }

		//错误方式二：
		//集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前。
		while (coll.iterator().hasNext()){
			System.out.println(coll.iterator().next());
		}


	}

	//测试Iterator中的remove()
	//如果还未调用next()或在上一次调用 next 方法之后已经调用了 remove 方法，
	// 再调用remove都会报IllegalStateException。
	@Test
	public void test3(){
		List<Object> coll = new ArrayList<>();
		coll.add(123);
		coll.add(456);
		coll.add(new Person("Jerry",20));
		coll.add("Tom");
		coll.add(false);

		//删除集合中"Tom"
		Iterator<Object> iterator = coll.iterator();
		while (iterator.hasNext()){
           // iterator.remove();
			Object obj = iterator.next();
			if("Tom".equals(obj)){
				iterator.remove();
			}else {
				System.out.println(obj);
			}
		}
		//遍历集合
		// iterator = coll.iterator();
		// while (iterator.hasNext()){
		// 	System.out.println(iterator.next());
		// }
	}
}
