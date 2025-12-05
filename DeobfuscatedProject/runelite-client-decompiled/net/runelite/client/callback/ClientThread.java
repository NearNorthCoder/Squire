/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  io.reactivex.rxjava3.plugins.RxJavaPlugins
 *  io.reactivex.rxjava3.schedulers.Schedulers
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 */
package net.runelite.client.callback;

import com.google.inject.Inject;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import javax.inject.Singleton;
import net.runelite.api.Client;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class ClientThread
implements Executor {
    private static final Logger log = LoggerFactory.getLogger(ClientThread.class);
    private final ConcurrentLinkedQueue<BooleanSupplier> invokes = new ConcurrentLinkedQueue();
    private final ConcurrentLinkedQueue<BooleanSupplier> invokesAtTickEnd = new ConcurrentLinkedQueue();
    private Client client;

    @Inject
    private ClientThread(Client client) {
        this.client = client;
        RxJavaPlugins.setSingleSchedulerHandler(old -> Schedulers.from((Executor)this));
    }

    @Override
    public void execute(@NotNull Runnable r) {
        this.invoke(r);
    }

    public void invoke(Runnable r) {
        this.invoke(() -> {
            r.run();
            return true;
        });
    }

    public void invoke(BooleanSupplier r) {
        if (this.client.isClientThread()) {
            if (!r.getAsBoolean()) {
                this.invokes.add(r);
            }
            return;
        }
        this.invokeLater(r);
    }

    public void invokeLater(Runnable r) {
        this.invokeLater(() -> {
            r.run();
            return true;
        });
    }

    public void invokeLater(BooleanSupplier r) {
        this.invokes.add(r);
    }

    public void invokeAtTickEnd(Runnable r) {
        this.invokesAtTickEnd.add(() -> {
            r.run();
            return true;
        });
    }

    public void invoke() {
        this.invokeList(this.invokes);
    }

    public void invokeTickEnd() {
        this.invokeList(this.invokesAtTickEnd);
    }

    private void invokeList(ConcurrentLinkedQueue<BooleanSupplier> invokes) {
        assert (this.client.isClientThread());
        Iterator<BooleanSupplier> ir = invokes.iterator();
        while (ir.hasNext()) {
            BooleanSupplier r = ir.next();
            boolean remove = true;
            try {
                remove = r.getAsBoolean();
            }
            catch (ThreadDeath d) {
                throw d;
            }
            catch (Throwable e) {
                log.error("Exception in invoke", e);
            }
            if (remove) {
                ir.remove();
                continue;
            }
            log.trace("Deferring task {}", (Object)r);
        }
    }
}

