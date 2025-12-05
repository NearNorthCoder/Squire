/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import net.runelite.client.util.CallableExceptionLogger;
import net.runelite.client.util.RunnableExceptionLogger;
import org.jetbrains.annotations.NotNull;

public class NonScheduledExecutorServiceExceptionLogger
implements ExecutorService {
    private final ExecutorService service;

    public NonScheduledExecutorServiceExceptionLogger(ExecutorService service) {
        this.service = service;
    }

    @Override
    public void shutdown() {
        this.service.shutdown();
    }

    @Override
    @NotNull
    public List<Runnable> shutdownNow() {
        return this.service.shutdownNow();
    }

    @Override
    public boolean isShutdown() {
        return this.service.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return this.service.isTerminated();
    }

    @Override
    public boolean awaitTermination(long timeout, @NotNull TimeUnit unit) throws InterruptedException {
        return this.service.awaitTermination(timeout, unit);
    }

    @Override
    public void execute(@NotNull Runnable command) {
        this.service.execute(RunnableExceptionLogger.wrap(command));
    }

    @Override
    @NotNull
    public <T> Future<T> submit(@NotNull Callable<T> task) {
        return this.service.submit(CallableExceptionLogger.wrap(task));
    }

    @Override
    @NotNull
    public <T> Future<T> submit(@NotNull Runnable task, T result) {
        return this.service.submit(RunnableExceptionLogger.wrap(task), result);
    }

    @Override
    @NotNull
    public Future<?> submit(@NotNull Runnable task) {
        return this.service.submit(RunnableExceptionLogger.wrap(task));
    }

    @Override
    @NotNull
    public <T> List<Future<T>> invokeAll(@NotNull Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return this.service.invokeAll(tasks);
    }

    @Override
    @NotNull
    public <T> List<Future<T>> invokeAll(@NotNull Collection<? extends Callable<T>> tasks, long timeout, @NotNull TimeUnit unit) throws InterruptedException {
        return this.service.invokeAll(tasks, timeout, unit);
    }

    @Override
    @NotNull
    public <T> T invokeAny(@NotNull Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return this.service.invokeAny(tasks);
    }

    @Override
    public <T> T invokeAny(@NotNull Collection<? extends Callable<T>> tasks, long timeout, @NotNull TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.service.invokeAny(tasks, timeout, unit);
    }
}

