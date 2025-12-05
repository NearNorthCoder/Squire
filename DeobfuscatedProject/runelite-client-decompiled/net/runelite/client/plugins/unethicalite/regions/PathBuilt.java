/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package net.runelite.client.plugins.unethicalite.regions;

import java.util.List;
import net.runelite.api.coords.WorldPoint;

public final class PathBuilt {
    private final List<WorldPoint> path;

    public PathBuilt(List<WorldPoint> path) {
        this.path = path;
    }

    public List<WorldPoint> getPath() {
        return this.path;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PathBuilt)) {
            return false;
        }
        PathBuilt other = (PathBuilt)o;
        List<WorldPoint> this$path = this.getPath();
        List<WorldPoint> other$path = other.getPath();
        return !(this$path == null ? other$path != null : !((Object)this$path).equals(other$path));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<WorldPoint> $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : ((Object)$path).hashCode());
        return result;
    }

    public String toString() {
        return "PathBuilt(path=" + String.valueOf(this.getPath()) + ")";
    }
}

