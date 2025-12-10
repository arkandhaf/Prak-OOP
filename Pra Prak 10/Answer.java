public class Answer {
    
    public void runUrAnswer() throws InterruptedException {
        Resource cpu = new Resource("CPU");
        Resource io0 = new Resource("IO0");
        Resource io1 = new Resource("IO1");

        ProcessTask p0 = new ProcessTask("P0", cpu, io0);
        ProcessTask p1 = new ProcessTask("P1", cpu, io1);
        ProcessTask p2 = new ProcessTask("P2", cpu, io0);

        p0.start();
        p0.join();

        p1.start();
        p1.join();

        p2.start();
            
        Thread.sleep(150); // Tunggu sampai P2 masuk fase IO
        p2.interrupt();

        p2.join();
    }
}