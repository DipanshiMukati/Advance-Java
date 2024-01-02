package in.com.hierarchyINHERITANCE;

public class Testperson {
     public static void main(String[] args) {
	 Person p = new Person();
     	  p.setName("kayu");
     	  p.setDob(23); 
     	  p.setAddress("sanawad");	     
	     System.out.println(p.getName());
         System.out.println(p.getDob());
         System.out.println(p.getAddress());
		 
         Bussinessmen b = new Bussinessmen();
         b.setName("ayansh");
    	  b.setDob(13); 
    	  b.setAddress("kgn");
    	  b.setIncome(5000000);
    	  b.setLoss(100000);
    	  
	     System.out.println(b.getName());
        System.out.println(b.getDob());
        System.out.println(b.getAddress());
        System.out.println(b.getIncome());
         System.out.println(b.getLoss());

         
         Student s = new Student();
         s.setName("siyu");
         s.setDob(2021);
         s.setAddress("kedwa");
         s.setMarks("100");
         s.setRollno("1");
         System.out.println(s.getName());
         System.out.println(s.getDob());
         System.out.println(s.getAddress());
         System.out.println(s.getMarks());
         System.out.println(s.getRollno());
         
         
         
          Doctor d = new Doctor();
          d.setName("dipu");
     	  d.setDob(2); 
     	  d.setAddress("indore");	
          d.setRegistrationNO("13579");
	     System.out.println(d.getName());
         System.out.println(d.getDob());
         System.out.println(d.getAddress());
         System.out.println(d.getRegisrationNO());
	}
}
