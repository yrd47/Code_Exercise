package Problem07;

import java.util.Stack;

/**
 * Created by yrd on 2018/3/1.
 *
 * 剑指Offer 面试题07
 * 用两个栈实现一个队列。队列的声明如下，请事先它的两个函数appendTail和deleteHead，分别完成在队列尾部插入节点和在队列头部删除节点的功能
 */
public class Problem07 {

    public static class MList<T> {
        //插入栈，只用于数据的插入
        private Stack<T> insertStack = new Stack<T>();
        //弹出栈，只用于弹出数据
        private Stack<T> deleteStack = new Stack<T>();

        public void appendTail(T t) {
            insertStack.push(t);
        }

        public T deleteHead() {
            if (deleteStack.isEmpty()) {
                while (!insertStack.isEmpty()) {
                    deleteStack.push(insertStack.pop());
                }
            }

            if (deleteStack.isEmpty()) {
                throw new RuntimeException("No more element.");
            }

            return deleteStack.pop();
        }
    }
}
