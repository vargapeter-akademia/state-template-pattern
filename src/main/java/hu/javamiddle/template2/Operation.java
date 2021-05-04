package hu.javamiddle.template2;

public abstract class Operation {

    private long start;

    public void execute() {
        start = System.currentTimeMillis();
        beforeExecution();
        doExecute();
        afterExecution();

        checkTime();

    }

    // Megtiltjuk a felüldefiniálás
    public final void checkTime() {
        System.out.println(System.currentTimeMillis() - start);
    }

    // Opcionális művelet
    protected void afterExecution() {

    }

    // Kötelező művelet
    protected abstract void doExecute();

    protected void beforeExecution() {

    }

}
