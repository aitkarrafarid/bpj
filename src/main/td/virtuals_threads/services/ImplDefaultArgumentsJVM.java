package td.virtuals_threads.services;

public class ImplDefaultArgumentsJVM implements IArgumentsJVM {

    @Override
    public long getXssJvmArgs() {
        long xss = 1024 * 1024; // Taille de pile typique (~1 Mo)
        return xss;
    }
}