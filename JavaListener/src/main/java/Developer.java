public class Developer {
    private DeveloperListener developerListener;



    public void registerListener(DeveloperListener developerListener) {
        this.developerListener = developerListener;
    }


    public void work() {
        if (developerListener != null) {
            this.developerListener.work(new Event(this));
        }
        System.out.println("developer work");
    }



    public void study(){
        if (developerListener != null){
            this.developerListener.study(new Event(this));
            System.out.println("developer study");
        }
    }
}
