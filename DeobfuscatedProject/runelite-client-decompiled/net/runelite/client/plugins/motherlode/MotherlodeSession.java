/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 */
package net.runelite.client.plugins.motherlode;

import java.time.Duration;
import java.time.Instant;
import javax.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
class MotherlodeSession {
    private static final Logger log = LoggerFactory.getLogger(MotherlodeSession.class);
    private static final long HOUR = Duration.ofHours(1L).toMillis();
    private int perHour;
    private Instant lastPayDirtMined;
    private int totalMined;
    private Instant recentPayDirtMined;
    private int recentMined;

    MotherlodeSession() {
    }

    public void incrementPayDirtMined() {
        Instant now;
        this.lastPayDirtMined = now = Instant.now();
        ++this.totalMined;
        if (this.recentMined == 0) {
            this.recentPayDirtMined = now;
        }
        ++this.recentMined;
        Duration timeSinceStart = Duration.between(this.recentPayDirtMined, now);
        if (!timeSinceStart.isZero()) {
            this.perHour = (int)((double)this.recentMined * (double)HOUR / (double)timeSinceStart.toMillis());
        }
    }

    public void resetRecent() {
        this.recentPayDirtMined = null;
        this.recentMined = 0;
    }

    public int getPerHour() {
        return this.perHour;
    }

    public Instant getLastPayDirtMined() {
        return this.lastPayDirtMined;
    }

    public int getTotalMined() {
        return this.totalMined;
    }

    public Instant getRecentPayDirtMined() {
        return this.recentPayDirtMined;
    }

    public int getRecentMined() {
        return this.recentMined;
    }
}

