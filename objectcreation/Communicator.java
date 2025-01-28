package objectcreation;

public class Communicator {

    public static void main(String[] args) {

        Candidate c1 = new Candidate();

        c1.name = "Vinay prasad";
        c1.age = 32;
        c1.chat("Hello...vinay! how are you");

        Candidate c2 = new Candidate();
        c2.name = "Chandana";
        c2.age = 24;
        c2.chat("Hello...Chandana! how are you");


        Candidate c3 = new Candidate();
        c3.name = "Vihaan V Prasad";
        c3.age = 2;
        c3.chat("Hello...Vihaan V Prasad! how are you");

        System.out.println("Total cnadidate : " + Candidate.Total);


    }
}

class Candidate{

    Candidate()
    {
        Total++;
    }

    String name;
    int age;
    static int Total= 0;

    public void chat(String content){

        System.out.println(name + "[" + age +"]" + "-->" + content);
    }

    public void increaseCounter(){
        Total++;
    }

}