/*
 * Decompiled with CFR 0.152.
 */
package net.unethicalite.api.plugins;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

private static class LoopedPlugin.LoggableExecutor
extends ScheduledThreadPoolExecutor {
    public LoopedPlugin.LoggableExecutor(int corePoolSize) {
        super(corePoolSize);
    }

    @Override
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        if (t == null && r instanceof Future) {
            try {
                Future future = (Future)((Object)r);
                if (future.isDone()) {
                    future.get();
                }
            }
            catch (CancellationException future) {
            }
            catch (ExecutionException ee) {
                t = ee.getCause();
            }
            catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
        if (t != null) {
            log.error("Error in loop", t);
        }
    }
}
