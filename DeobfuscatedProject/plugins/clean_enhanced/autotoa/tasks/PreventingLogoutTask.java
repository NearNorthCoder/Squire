/*
 * Decompiled with CFR 0.152.
 *
 * Logout Prevention Task
 *
 * This task prevents the player from being logged out due to inactivity.
 * It works by simulating key events when the player has been idle for too long.
 *
 * The task:
 * - Monitors mouse and keyboard idle ticks
 * - Simulates backspace key events when idle threshold is reached
 * - Uses random cooldown intervals to appear more human-like
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Client;

@TaskDesc(name="Preventing Logout")
public class PreventingLogoutTask extends Task {

    // Constants - KeyEvent IDs
    private static final int KEY_PRESSED = 401;   // 0x77F7
    private static final int KEY_RELEASED = 402;  // 0x2FFA
    private static final int KEY_TYPED = 400;     // 0x1B6

    // Key code for backspace
    private static final int VK_BACK_SPACE = 8;

    // Modifier keys (none used)
    private static final int MODIFIERS = 0;

    private long nextIdleThreshold;

    @Inject
    private Client client;

    @Override
    public boolean run() {
        // Check if player is idle
        if (isPlayerIdle()) {
            // Calculate new random threshold
            this.nextIdleThreshold = calculateRandomThreshold();

            // Simulate key events in background thread
            Executors.newSingleThreadExecutor().submit(this::simulateKeyEvents);

            return true;
        }

        return false;
    }

    /**
     * Checks if the player is idle based on mouse and keyboard ticks
     * @return true if player is idle and threshold exceeded
     */
    private boolean isPlayerIdle() {
        int keyboardIdleTicks = this.client.getKeyboardIdleTicks();
        int mouseIdleTicks = this.client.getMouseIdleTicks();

        // Get the maximum of keyboard and mouse idle ticks
        int maxIdleTicks = Math.max(keyboardIdleTicks, mouseIdleTicks);

        // Check if idle time exceeds threshold
        return maxIdleTicks >= this.nextIdleThreshold;
    }

    /**
     * Calculates a random idle threshold using Gaussian distribution
     * This makes the timing more human-like and less predictable
     * @return random threshold in ticks
     */
    private long calculateRandomThreshold() {
        // Generate random value with Gaussian distribution (mean=0, stddev=1)
        double gaussian = ThreadLocalRandom.current().nextGaussian();

        // Scale to approximately 8000 ticks (8 seconds at 100 ticks/sec)
        double rawValue = gaussian * 8000.0;

        // Clamp between 1 and 13000 ticks (1-13 seconds)
        return Math.round(clampValue(rawValue));
    }

    /**
     * Clamps a value between 1.0 and 13000.0
     * @param value the value to clamp
     * @return clamped value
     */
    private double clampValue(double value) {
        return Math.max(1.0, Math.min(13000.0, value));
    }

    /**
     * Simulates key events to prevent logout
     * Dispatches KEY_PRESSED, KEY_RELEASED, and KEY_TYPED events for backspace
     */
    private void simulateKeyEvents() {
        long currentTime = System.currentTimeMillis();

        // KEY_PRESSED event
        KeyEvent keyPressed = new KeyEvent(
            this.client.getCanvas(),
            KEY_PRESSED,
            currentTime,
            MODIFIERS,
            VK_BACK_SPACE
        );
        this.client.getCanvas().dispatchEvent(keyPressed);

        // KEY_RELEASED event
        KeyEvent keyReleased = new KeyEvent(
            this.client.getCanvas(),
            KEY_RELEASED,
            currentTime,
            MODIFIERS,
            VK_BACK_SPACE
        );
        this.client.getCanvas().dispatchEvent(keyReleased);

        // KEY_TYPED event
        KeyEvent keyTyped = new KeyEvent(
            this.client.getCanvas(),
            KEY_TYPED,
            currentTime,
            MODIFIERS,
            VK_BACK_SPACE
        );
        this.client.getCanvas().dispatchEvent(keyTyped);
    }
}
