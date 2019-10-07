package Assignment4;

public class Question_2 {
    public static void main(String[] args) {
        HappyObject happyObject = new HappyObject();
        SadObject sadObject = new SadObject();
        PsychiatristObject psychiatristObject = new PsychiatristObject();
        System.out.println("How are you feeling today?");
//        happyObject.queryMood();
//        happyObject.expressFeelings();
        psychiatristObject.examine(happyObject);
        psychiatristObject.observe(happyObject);
        System.out.printf("%n"); //print a new line
        System.out.println("How are you feeling today?");
        psychiatristObject.examine(sadObject);
        psychiatristObject.observe(sadObject);
//        sadObject.queryMood();
//        sadObject.expressFeelings();
//        psychiatrist.observe(sadObject); // use overloading so that we can observe the objects
    }
}

abstract class MoodyObject{
    protected abstract String getMood();
    protected abstract void expressFeelings();
    public void queryMood() {
        System.out.println("i feel " + getMood() + " today");
    }

}
class HappyObject extends MoodyObject{
    protected String getMood(){
        return "happy";
    }

    @Override
    protected void expressFeelings() {
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }
    public String toString(){
        return "laughs";
    }
    public void observation(){
        System.out.println("Observation: Subject " + toString() + " a lot");
    }

}
class SadObject extends MoodyObject {
    @Override
    protected String getMood() {
        return "sad";
    }

    @Override
    protected void expressFeelings() {
        System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
    }
    public String toString(){
        return "cries";
    }
    public void observation(){
        System.out.println("Observation: Subject " + toString() + " a lot");
    }
}
class PsychiatristObject {

    // use inclusion polymorphism to examine all moody objects generically
    public void examine( MoodyObject moodyObject ) {
        moodyObject.queryMood();
    }
    public void observe(MoodyObject moodyObject){
        moodyObject.expressFeelings();
        System.out.println("Observation: Subject " + moodyObject.toString() + " a lot.");
    }

//    // use overloading to observe objects specifically, but with a generically named method
//    public void observe( SadObject sadObject ) {
//        System.out.println( "Observatin: Subject cries a lot today" );
//    }
//    public void observe( HappyObject happyObject ) {
//        System.out.println( "Observatin: Subject laughs a lot today" );
//    }
}




