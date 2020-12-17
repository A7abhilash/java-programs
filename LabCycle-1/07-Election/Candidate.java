public class Candidate {
    private int count;
    private String name;
    private String party;

    Candidate(String name,String party){
        this.count=0;
        this.name=name;
        this.party=party;
    }

    public void castVote(){
        this.count++;
    }

    public int getCounts(){
        return this.count;
    }

    public void getInfo(){
        System.out.println(this.name + "\t\t" + this.party + "\t\t" + this.count);
    }
}
