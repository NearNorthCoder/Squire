package net.runelite.launcher.logging;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * Simple Java agent that transforms OkHttpClient to add network logging.
 * Uses only JDK APIs - no external dependencies required.
 */
public class SimpleNetworkAgent {

    private static Instrumentation instrumentation;
    private static boolean attached = false;

    /**
     * Called when agent is loaded at JVM startup via -javaagent
     */
    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("[NetworkAgent] Agent loaded (premain)");
        instrumentation = inst;
        attached = true;
        installTransformer(inst);
    }

    /**
     * Called when agent is attached at runtime
     */
    public static void agentmain(String agentArgs, Instrumentation inst) {
        System.out.println("[NetworkAgent] Agent attached (agentmain)");
        instrumentation = inst;
        attached = true;
        installTransformer(inst);
    }

    private static void installTransformer(Instrumentation inst) {
        inst.addTransformer(new OkHttpTransformer(), true);
        System.out.println("[NetworkAgent] OkHttp transformer installed");
    }

    public static boolean isAttached() {
        return attached;
    }

    public static Instrumentation getInstrumentation() {
        return instrumentation;
    }

    /**
     * Transformer that adds logging to OkHttpClient
     */
    static class OkHttpTransformer implements ClassFileTransformer {
        @Override
        public byte[] transform(ClassLoader loader, String className,
                                Class<?> classBeingRedefined,
                                ProtectionDomain protectionDomain,
                                byte[] classfileBuffer) {
            // We'll log which classes are being loaded for OkHttp
            if (className != null && className.startsWith("okhttp3/")) {
                System.out.println("[NetworkAgent] OkHttp class loaded: " + className);
            }
            // Return null to not transform (we'll use interceptor approach instead)
            return null;
        }
    }
}
