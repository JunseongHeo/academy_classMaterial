package ch9_classDesign;

public class ReturnThis {
	    private int i = 0;
	 
	    public ReturnThis getMySelf() {
	        //this ��ü�� ����, this�� ���� Ŭ������ ��
	        return this;
	    }
	    public void print(int i){
	        // this �� ������� �������� print(int i)�� �Ҵ��Ͽ� ��� ���� 0
	        // this �� ��������� �־��־����� ��� ������ �Ҵ��Ͽ� 1,2,3,4 ���� ���� ����
	        this.i++;
	        System.out.println("member i = " + this.i);
	    }
	    public static void main(String args[]) {
	    	ReturnThis st1 = new ReturnThis(); //��ü����
	        System.out.println("SoloThis st1:" + st1);
	        st1.print(0);
	        st1.print(2);
	        ReturnThis st2 = st1.getMySelf(); //��ü ����
	        System.out.println("SoloThis st2:" + st2);
	        st2.print(0);
	        st2.print(0);
	    }
}
