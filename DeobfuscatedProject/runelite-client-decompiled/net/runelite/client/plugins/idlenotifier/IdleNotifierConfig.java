/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.client.plugins.idlenotifier;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Notification;
import net.runelite.client.config.Range;
import net.runelite.client.config.Units;

@ConfigGroup(value="idlenotifier")
public interface IdleNotifierConfig
extends Config {
    public static final String GROUP = "idlenotifier";

    @ConfigItem(keyName="animationidle", name="Idle Animation Notifications", description="Configures if idle animation notifications are enabled", position=1)
    default public Notification animationIdle() {
        return Notification.ON;
    }

    @ConfigItem(keyName="interactionidle", name="Idle Interaction Notifications", description="Configures if idle interaction notifications are enabled e.g. combat, fishing", position=2)
    default public Notification interactionIdle() {
        return Notification.ON;
    }

    @ConfigItem(keyName="movementidle", name="Idle Movement Notifications", description="Configures if idle movement notifications are enabled e.g. running, walking", position=3)
    default public Notification movementIdle() {
        return Notification.OFF;
    }

    @ConfigItem(keyName="logoutidle", name="Idle Logout Notifications", description="Configures if the idle logout notifications are enabled", position=4)
    default public Notification logoutIdle() {
        return Notification.ON;
    }

    @ConfigItem(keyName="timeout", name="Idle Notification Delay", description="The notification delay after the player is idle", position=5)
    @Units(value="ms")
    default public int getIdleNotificationDelay() {
        return 5000;
    }

    @ConfigItem(keyName="hitpointsNotification", name="Hitpoints Notification", description="Configures if hitpoints notifications are enabled", position=6)
    default public Notification getHitpointsNotification() {
        return Notification.OFF;
    }

    @ConfigItem(keyName="hitpoints", name="Hitpoints Threshold", description="The amount of hitpoints to send a notification at.", position=7)
    @Range(min=1)
    default public int getHitpointsThreshold() {
        return 1;
    }

    @ConfigItem(keyName="prayerNotification", name="Prayer Notification", description="Configures if prayer notifications are enabled.", position=8)
    default public Notification getPrayerNotification() {
        return Notification.OFF;
    }

    @ConfigItem(keyName="prayer", name="Prayer Threshold", description="The amount of prayer points to send a notification at.", position=9)
    @Range(min=1)
    default public int getPrayerThreshold() {
        return 1;
    }

    @ConfigItem(keyName="lowEnergyNotification", name="Low Energy Notification", description="Configures if low energy notifications are enabled", position=10)
    default public Notification getLowEnergyNotification() {
        return Notification.OFF;
    }

    @ConfigItem(keyName="lowEnergy", name="Low Energy Threshold", description="The amount of energy points remaining to send a notification at.", position=11)
    @Units(value="%")
    @Range(max=99)
    default public int getLowEnergyThreshold() {
        return 0;
    }

    @ConfigItem(keyName="highEnergyNotification", name="High Energy Notification", description="Configures if high energy notifications are enabled", position=12)
    default public Notification getHighEnergyNotification() {
        return Notification.OFF;
    }

    @ConfigItem(keyName="highEnergy", name="High Energy Threshold", description="The amount of energy points reached to send a notification.", position=13)
    @Units(value="%")
    @Range(min=1, max=100)
    default public int getHighEnergyThreshold() {
        return 100;
    }

    @ConfigItem(keyName="oxygenNotification", name="Oxygen Notification", description="Configures if oxygen notifications are enabled", position=14)
    default public Notification getOxygenNotification() {
        return Notification.OFF;
    }

    @ConfigItem(keyName="oxygen", name="Oxygen Threshold", position=15, description="The amount of remaining oxygen to send a notification at.")
    @Units(value="%")
    @Range(min=1)
    default public int getOxygenThreshold() {
        return 1;
    }

    @ConfigItem(keyName="specNotification", name="Spec Notification", description="Configures if special attack notifications are enabled", position=16)
    default public Notification getSpecNotification() {
        return Notification.OFF;
    }

    @ConfigItem(keyName="spec", name="Spec Threshold", position=17, description="The amount of special attack energy reached to send a notification at.")
    @Units(value="%")
    @Range(min=1)
    default public int getSpecEnergyThreshold() {
        return 1;
    }
}

