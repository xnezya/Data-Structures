public class GenericStackOps <T extends Comparable<T>>{

    public boolean search (GenericStack<T> s,T val){
        GenericStack<T> temp = new GenericStack<T>((Class<T>)val.getClass(), s.size());
        boolean found = false;

        while(!s.isEmpty()){
            T topElement = s.pop();
            temp.push(topElement);
            if(topElement.compareTo(val)==0){
                found= true;
                break;
            }
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return found;
    }

    //public float calculatePostfix(String postfix){

    //}

    public T FindMax(GenericStack<T> stk){
        if(!stk.isEmpty()){
            T max = stk.pop();
            GenericStack<T> temp = new GenericStack((Class<T>)max.getClass(), stk.size() );
            temp.push(max);
            while(!stk.isEmpty()){
                T val = stk.pop();
                temp.push(val);
                if(val.compareTo(max)==1){
                    max = val;
                }
            }
            while(!temp.isEmpty()){
                stk.push(temp.pop());
            }
            return max;
        }
        return null;
    }
    public boolean isPolindrome(String s){
        char f = s.charAt(0);
        int index=0;

        GenericStack<Character> st=new GenericStack(Character.class, s.length());
        Queue<Character> q=new Queue(Character.class, s.length());
        while(index<s.length()){
            st.push(s.charAt(index));
            q.enqueue(s.charAt(index));
            index++;
        }
        while(!st.isEmpty()){
            if(st.pop()!=q.dequeue()){
                return false;
            }
        }
        return true;
    }
}
