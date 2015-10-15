public class Job implements Runnable {
  int job number;
  Job (int job number) {
    this.jobNumber = jobNumber;
  }
  public void run (){
  // undertake required work, here we will emulate it by sleeping for a period
  System.out.println("Job: " +jobNumber + " is being processed by thread : " +Thread.currentThread ().getName());
  try {
        Thread.sleep((int) (1000));
  }
  catch (Interrupted Exception e){
    // no cathching as example should not experience interruptions.
    }
  System.out.println("job: "+ jobNumber + "is ending in thread : " +Thread.currentThread().getName());
  }
}
