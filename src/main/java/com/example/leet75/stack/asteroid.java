package com.example.leet75.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class asteroid {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int ast: asteroids){
            if(stack.isEmpty())
                stack.push(ast);
            else{
                boolean push = true;
                while(!stack.isEmpty() && ast<0 && stack.peek() >0){
                    int absA = Math.abs(ast);
                    int absB = Math.abs(stack.peek());
                    if(absA == absB){
                        stack.pop();
                        push = false;
                        break;
                    }
                    else if(absB < absA){
                        stack.pop();
                    }else{
                        push = false;
                        break;
                    }
                }
                if(push) stack.push(ast);

            }
        }
        int[] reversedArray = new int[stack.size()];

        // 2. Pop elements into the array
        for (int i = reversedArray.length-1; i >=0; i--) {
            reversedArray[i] = stack.pop(); // Popping returns the "top" element first
        }
        return reversedArray;
    }
}
