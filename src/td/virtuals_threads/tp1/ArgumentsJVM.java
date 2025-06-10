package td.decoupage.virtuals_threads.tp1;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

public class ArgumentsJVM {
    //    public static void main(String[] args) {
    private long xss = 1024 * 1024; // Taille de pile typique (~1 Mo)
    private String unite;

    public long getXssJvmArgs() {
        // Cherche Xss dans les arguments JVM
        RuntimeMXBean runtimeMxBean = ManagementFactory.getRuntimeMXBean();
        List<String> jvmArgs = runtimeMxBean.getInputArguments();
        String xssValue = null;

        for (String arg : jvmArgs) {
            if (arg.startsWith("-Xss")) {
                xssValue = arg.substring(4);
                unite = xssValue.substring(xssValue.length() - 1);
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
//    }
    public long getXss() {
        return xss;
    }

    public void setXss(long xss) {
        this.xss = xss;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }
}
