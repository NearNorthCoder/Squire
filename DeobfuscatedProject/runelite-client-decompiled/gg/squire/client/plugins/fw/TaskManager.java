/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Injector
 *  net.runelite.api.Client
 *  net.runelite.api.events.GameTick
 */
package gg.squire.client.plugins.fw;

import com.google.inject.Inject;
import com.google.inject.Injector;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.fw.SleepingTask;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskManager {
    private static final Logger log = LoggerFactory.getLogger(TaskManager.class);
    private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newSingleThreadScheduledExecutor();
    private final CopyOnWriteArrayList<Task> tasks = new CopyOnWriteArrayList();
    private final HashMap<Task, TaskDesc> descriptorHashMap = new HashMap();
    private final EventBus eventBus;
    private long lastTaskRun = System.currentTimeMillis();
    private Task currentTask;
    private SquirePlugin currentPlugin;

    @Inject
    public TaskManager(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void registerTasks(Injector injector, Class<?>[] tasks) {
        for (Class<?> task : tasks) {
            if (!task.isAnnotationPresent(TaskDesc.class)) {
                log.error("Task {} is not annotated with @TaskDescriptor", (Object)task.getSimpleName());
                continue;
            }
            if (!Task.class.isAssignableFrom(task)) {
                log.error("Task {} is not a subclass of Task", (Object)task.getAnnotation(TaskDesc.class).name());
                continue;
            }
            this.registerTask(injector, task);
        }
    }

    public void registerTask(Injector injector, Class<? super Task> task) {
        Task instance = (Task)injector.getInstance(task);
        TaskDesc descriptor = task.getAnnotation(TaskDesc.class);
        this.registerTask(instance, descriptor);
    }

    public String getCurrentTask() {
        return this.currentTask == null ? "None" : this.descriptorHashMap.get(this.currentTask).name();
    }

    private void registerTask(Task task, TaskDesc descriptor) {
        this.tasks.add(task);
        if (descriptor.register()) {
            this.eventBus.register(task);
        }
        this.descriptorHashMap.put(task, descriptor);
    }

    public void start(SquirePlugin squirePlugin) {
        this.eventBus.register(this);
        this.currentPlugin = squirePlugin;
        this.tasks.sort(Comparator.comparing(t -> this.descriptorHashMap.get(t).priority()).reversed());
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (this.currentPlugin.isPaused() || !this.currentPlugin.isEnabled()) {
            return;
        }
        for (Task task : this.tasks) {
            SleepingTask sleepingTask;
            if (!(task instanceof SleepingTask) || !(sleepingTask = (SleepingTask)task).run()) continue;
            SquirePlugin.PLUGIN_SLEEPS.compute(this.currentPlugin.getResourceName(), (k, v) -> v == null ? 0 : v - 1);
        }
        if (SquirePlugin.PLUGIN_SLEEPS.getOrDefault(this.currentPlugin.getResourceName(), 0) > 0) {
            return;
        }
        this.taskLoopInstant();
        int tick = Static.getClient().getTickCount();
        int delay = Rand.nextInt(55, 190);
        SCHEDULED_EXECUTOR_SERVICE.schedule(() -> GameThread.invoke(() -> this.taskLoop(tick)), (long)delay, TimeUnit.MILLISECONDS);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void taskLoop(int tick) {
        for (Task task : this.tasks) {
            TaskDesc descriptor = this.descriptorHashMap.get(task);
            if (descriptor == null) {
                log.error("Descriptor was null for task: {}", (Object)task.getClass().getSimpleName());
                continue;
            }
            if (descriptor.instant() || task.sleeping()) continue;
            if (this.checkShutdown(descriptor)) {
                return;
            }
            if (descriptor.client()) continue;
            Client client = Static.getClient();
            int tickRightNow = client.getTickCount();
            client.setTickCount(tick);
            try {
                if (!task.run()) continue;
                this.currentTask = task;
                if (!descriptor.blocking()) continue;
                break;
            }
            finally {
                client.setTickCount(tickRightNow);
            }
        }
    }

    private void taskLoopInstant() {
        for (Task task : this.tasks) {
            TaskDesc descriptor = this.descriptorHashMap.get(task);
            if (descriptor == null) {
                log.error("Descriptor was null for task: {}", (Object)task.getClass().getSimpleName());
                continue;
            }
            if (!descriptor.instant() || task.sleeping()) continue;
            if (this.checkShutdown(descriptor)) {
                return;
            }
            if (descriptor.client() || !task.run()) continue;
            this.currentTask = task;
            if (!descriptor.blocking()) continue;
            break;
        }
    }

    public boolean checkShutdown(TaskDesc taskDesc) {
        if (this.currentPlugin.getStopAfter().minus(this.currentPlugin.getRuntime()).isNegative() && taskDesc.stoppable()) {
            this.currentPlugin.forceStop();
            return true;
        }
        return false;
    }

    public void loop() {
        if (this.currentPlugin.isPaused()) {
            return;
        }
        for (Task task : this.tasks) {
            TaskDesc descriptor = this.descriptorHashMap.get(task);
            if (!descriptor.client() || System.currentTimeMillis() - this.lastTaskRun < 15L || !task.run()) continue;
            this.lastTaskRun = System.currentTimeMillis();
            System.out.println("Ran gt task: " + task.getClass().getSimpleName());
            if (!descriptor.blocking()) continue;
            break;
        }
    }

    public void stop() {
        this.eventBus.unregister(this);
        for (Task task : this.tasks) {
            this.eventBus.unregister(task);
        }
        this.tasks.clear();
        this.descriptorHashMap.clear();
        this.currentTask = null;
    }

    public boolean canPause() {
        return this.currentTask == null || this.descriptorHashMap.get(this.currentTask).stoppable();
    }

    public CopyOnWriteArrayList<Task> getTasks() {
        return this.tasks;
    }
}

