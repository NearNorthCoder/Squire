/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.Projectile;

public class ProjectileSpawned {
    private Projectile projectile;

    public Projectile getProjectile() {
        return this.projectile;
    }

    public void setProjectile(Projectile projectile) {
        this.projectile = projectile;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProjectileSpawned)) {
            return false;
        }
        ProjectileSpawned other = (ProjectileSpawned)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Projectile this$projectile = this.getProjectile();
        Projectile other$projectile = other.getProjectile();
        return !(this$projectile == null ? other$projectile != null : !this$projectile.equals(other$projectile));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProjectileSpawned;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Projectile $projectile = this.getProjectile();
        result = result * 59 + ($projectile == null ? 43 : $projectile.hashCode());
        return result;
    }

    public String toString() {
        return "ProjectileSpawned(projectile=" + String.valueOf(this.getProjectile()) + ")";
    }
}

