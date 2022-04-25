package ch9_classDesign;

public class ReturnThis {
	    private int i = 0;
	 
	    public ReturnThis getMySelf() {
	        //this 자체를 리턴, this의 형은 클래스의 형
	        return this;
	    }
	    public void print(int i){
	        // this 가 없을경우 지역변수 print(int i)를 할당하여 결과 값이 0
	        // this 를 명시적으로 넣어주었을때 멤버 변수를 할당하여 1,2,3,4 증가 값이 나옴
	        this.i++;
	        System.out.println("member i = " + this.i);
	    }
	    public static void main(String args[]) {
	    	ReturnThis st1 = new ReturnThis(); //객체생성
	        System.out.println("SoloThis st1:" + st1);
	        st1.print(0);
	        st1.print(2);
	        ReturnThis st2 = st1.getMySelf(); //객체 생성
	        System.out.println("SoloThis st2:" + st2);
	        st2.print(0);
	        st2.print(0);
	    }
}
