import java.io.Serializable;

    public class userInput implements Serializable{
        private static final long serialVersionUID = 1L;


        public int age ;
        public String name;        
        public String address;

        public userInput(int a, String n, String ad ){
            this.age = a;
            this.name = n;            
            this.address = ad;
    }

    public int tohashCode(){return age;}
    public String toString(){return name +"\n" +address;}
}
    
    

