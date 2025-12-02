# Squire Framework
`gg.squire.client.plugins`

---

# Task
`gg.squire.client.plugins.fw.Task`

Abstract base class for all plugin tasks.

## Abstract Methods
```java
abstract boolean run()
```

## Instance Methods - Sleeping
```java
sleep(int ticks) → void
sleepWhile(int ticks, BooleanSupplier condition) → void
sleeping() → boolean
```

## Instance Methods - Tick Management
```java
tick(SquirePlugin plugin) → void
tick(SquirePlugin plugin, int diff) → void
unfreeze(SquirePlugin plugin) → void
globalSleep(SquirePlugin plugin, int ticks) → void
```

## Instance Methods - State
```java
getTickSleep() → int
getTickSleepIncrement() → int
getCondition() → BooleanSupplier
```

## Fields
```java
private int tickSleep
private int tickSleepIncrement
private BooleanSupplier condition
```

## Usage Examples
Source: Framework decompiled

```java
@TaskDesc(name="MyTask", priority=50, blocking=true)
public class MyTask extends Task {

    @Inject
    private Client client;

    @Override
    public boolean run() {
        // Task logic here
        if (shouldDoAction()) {
            doAction();
            sleep(2); // Sleep for 2 ticks
            return true; // Task ran successfully
        }
        return false; // Task didn't run
    }
}
```

---

# TaskDesc
`gg.squire.client.plugins.fw.TaskDesc`

Annotation for task configuration.

## Annotation Elements
```java
@Retention(RetentionPolicy.RUNTIME)
public @interface TaskDesc {
    String name() default "";
    int priority() default 0;
    boolean register() default false;
    boolean blocking() default false;
    boolean client() default false;
    boolean stoppable() default false;
    boolean instant() default false;
}
```

## Element Descriptions
| Element | Default | Description |
|---------|---------|-------------|
| `name` | "" | Display name for the task |
| `priority` | 0 | Higher priority tasks run first |
| `register` | false | Register task with EventBus |
| `blocking` | false | If true, stops lower priority tasks from running |
| `client` | false | Run on client thread (not game tick) |
| `stoppable` | false | Can be stopped when plugin stops |
| `instant` | false | Run immediately (before tick delay) |

## Usage Examples
Source: `plugins/clean_enhanced/vorkath/tasks/`

```java
// High priority blocking task
@TaskDesc(name="Banking", priority=80, blocking=true)
public class BankingTask extends Task { ... }

// Combat task with event registration
@TaskDesc(name="Attack", priority=10, register=true)
public class AttackTask extends Task { ... }

// Low priority task
@TaskDesc(name="Loot", priority=5, blocking=false)
public class LootTask extends Task { ... }

// Stoppable task
@TaskDesc(name="Walking", priority=20, stoppable=true)
public class WalkingTask extends Task { ... }
```

---

# TaskManager
`gg.squire.client.plugins.fw.TaskManager`

Manages task registration, execution order, and game tick handling.

## Constructor
```java
@Inject
TaskManager(EventBus eventBus)
```

## Instance Methods - Task Registration
```java
registerTasks(Injector injector, Class<?>[] tasks) → void
registerTask(Injector injector, Class<? super Task> task) → void
```

## Instance Methods - Lifecycle
```java
start(SquirePlugin squirePlugin) → void
stop() → void
loop() → void
```

## Instance Methods - State
```java
getCurrentTask() → String
canPause() → boolean
getTasks() → CopyOnWriteArrayList<Task>
```

## Instance Methods - Shutdown Check
```java
checkShutdown(TaskDesc taskDesc) → boolean
```

## Event Handlers
```java
@Subscribe
onGameTick(GameTick gameTick) → void
```

## Internal Methods
```java
private taskLoop(int tick) → void
private taskLoopInstant() → void
```

## Fields
```java
private final CopyOnWriteArrayList<Task> tasks
private final HashMap<Task, TaskDesc> descriptorHashMap
private final EventBus eventBus
private long lastTaskRun
private Task currentTask
private SquirePlugin currentPlugin
private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE
```

## Usage Examples
Source: Framework decompiled

```java
// In plugin startup
public class MyPlugin extends SquirePlugin {
    @Inject
    private TaskManager taskManager;

    @Override
    protected void startUp() {
        taskManager.registerTasks(injector, new Class<?>[] {
            BankingTask.class,
            AttackTask.class,
            LootTask.class
        });
        taskManager.start(this);
    }

    @Override
    protected void shutDown() {
        taskManager.stop();
    }
}
```

---

# SquirePlugin
`gg.squire.client.plugins.SquirePlugin`

Base class for all Squire plugins. Extends RuneLite Plugin.

## Static Fields
```java
public static final Map<String, Integer> PLUGIN_SLEEPS = new ConcurrentHashMap<>()
```

## Abstract/Override Methods
```java
abstract String getResourceName()
```

## Instance Methods - State
```java
isPaused() → boolean
isEnabled() → boolean
pause() → void
resume() → void
```

## Instance Methods - Runtime
```java
getRuntime() → Duration
getStopAfter() → Duration
forceStop() → void
```

## Plugin Lifecycle (inherited from Plugin)
```java
protected void startUp()
protected void shutDown()
```

## Usage Examples
Source: Framework decompiled

```java
@PluginDescriptor(
    name = "My Bot",
    description = "Description here",
    tags = {"squire", "bot"}
)
public class MyBotPlugin extends SquirePlugin {

    @Inject
    private Client client;

    @Inject
    private TaskManager taskManager;

    @Override
    public String getResourceName() {
        return "mybot";
    }

    @Override
    protected void startUp() {
        // Register tasks
        taskManager.registerTasks(injector, new Class<?>[] {
            Task1.class,
            Task2.class
        });
        taskManager.start(this);
    }

    @Override
    protected void shutDown() {
        taskManager.stop();
    }
}
```

---

# SleepingTask
`gg.squire.client.plugins.fw.SleepingTask`

Special task type that runs every tick regardless of global sleep.

## Usage
Tasks extending SleepingTask will have their `run()` method called on every game tick, even when the plugin has a global sleep active. Used for tasks that need to monitor state continuously.

---

# Common Plugin Pattern

## Complete Plugin Structure
```java
// Config interface
@ConfigGroup("mybot")
public interface MyBotConfig extends Config {
    @ConfigItem(keyName = "option1", name = "Option 1", description = "Description")
    default boolean option1() { return true; }
}

// Main plugin class
@PluginDescriptor(name = "My Bot")
public class MyBotPlugin extends SquirePlugin {

    @Inject private Client client;
    @Inject private MyBotConfig config;
    @Inject private TaskManager taskManager;

    @Override
    public String getResourceName() { return "mybot"; }

    @Override
    protected void startUp() {
        taskManager.registerTasks(injector, new Class<?>[] {
            HighPriorityTask.class,
            MediumPriorityTask.class,
            LowPriorityTask.class
        });
        taskManager.start(this);
    }

    @Override
    protected void shutDown() {
        taskManager.stop();
    }
}

// Task with dependency injection
@TaskDesc(name="HighPriority", priority=100, blocking=true)
public class HighPriorityTask extends Task {

    @Inject private Client client;
    @Inject private MyBotConfig config;

    @Override
    public boolean run() {
        if (!shouldRun()) return false;

        doAction();
        sleep(2);
        return true;
    }

    private boolean shouldRun() {
        return config.option1() && someCondition();
    }
}
```

## Task Priority Guidelines
| Priority Range | Use Case |
|---------------|----------|
| 90-100 | Critical safety tasks (flee, eat) |
| 70-89 | Banking, restocking |
| 50-69 | Main activity (combat, skilling) |
| 30-49 | Secondary actions (looting, spec) |
| 10-29 | Low priority (prayer flicking) |
| 0-9 | Cleanup, idle tasks |
