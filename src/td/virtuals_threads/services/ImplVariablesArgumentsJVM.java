package td.decoupage.virtuals_threads.services;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

// -Xmx16m -Xss2m
public class ImplVariablesArgumentsJVM implements IArgumentsJVM {

    @Override
    public long getXssJvmArgs() {
        long xss = 1024 * 1024; // Taille de pile typique (~1 Mo)
        // Cherche Xss dans les arguments JVM
        RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
        List<String> jvmArgs = runtimeMxBean.getInputArguments();
        String xssValue = null;

        for (String arg : jvmArgs) {
            if (arg.startsWith("-Xss")) {
                xssValue = arg.substring(4);
                String unite = xssValue.substring(xssValue.length() - 1);
                xssValue = arg.replaceAll("\\D", ""); // Supprime tout ce qui n'est pas un chiffre
                switch (unite) {
                    case "k":
                        xss = (1024) * Long.parseLong(xssValue);
                        break;
                    case "m":
                        xss = (1024 * 1024) * Long.parseLong(xssValue);
                        break;
                    case "g":
                        xss = (1024 * 1024 * 1024) * Long.parseLong(xssValue);
                        break;
                    default:
                        System.out.println("Numéro invalide !");
                }
                break;
            }
        }
        return xss;
    }
}