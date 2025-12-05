/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.game;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameThread {
    private static final Logger log = LoggerFactory.getLogger(GameThread.class);
    private static final long TIMEOUT = 2500L;

    public static void invoke(Runnable runnable) {
        if (Static.getClient().isClientThread()) {
            runnable.run();
        } else {
            Static.getClientThread().invokeLater(runnable);
        }
    }

    public static <T> T invokeLater(Callable<T> callable) {
        if (Static.getClient().isClientThread()) {
            try {
                return callable.call();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            FutureTask<T> futureTask = new FutureTask<T>(callable);
            Static.getClientThread().invokeLater(futureTask);
            return futureTask.get(2500L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
            return null;
        }
    }
}

