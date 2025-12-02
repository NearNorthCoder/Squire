/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package net.unethicalite.api.movement.pathfinder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.coords.WorldPoint;

private static final class Pathfinder.Node {
    private final WorldPoint position;
    private final Pathfinder.Node previous;

    public List<WorldPoint> path() {
        LinkedList<WorldPoint> path = new LinkedList<WorldPoint>();
        Pathfinder.Node node = this;
        while (node != null) {
            path.add(0, node.position);
            node = node.previous;
        }
        return new ArrayList<WorldPoint>(path);
    }

    public Pathfinder.Node(WorldPoint position, Pathfinder.Node previous) {
        this.position = position;
        this.previous = previous;
    }

    public WorldPoint getPosition() {
        return this.position;
    }

    public Pathfinder.Node getPrevious() {
        return this.previous;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Pathfinder.Node)) {
            return false;
        }
        Pathfinder.Node other = (Pathfinder.Node)o;
        WorldPoint this$position = this.getPosition();
        WorldPoint other$position = other.getPosition();
        if (this$position == null ? other$position != null : !this$position.equals(other$position)) {
            return false;
        }
        Pathfinder.Node this$previous = this.getPrevious();
        Pathfinder.Node other$previous = other.getPrevious();
        return !(this$previous == null ? other$previous != null : !((Object)this$previous).equals(other$previous));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        WorldPoint $position = this.getPosition();
        result = result * 59 + ($position == null ? 43 : $position.hashCode());
        Pathfinder.Node $previous = this.getPrevious();
        result = result * 59 + ($previous == null ? 43 : ((Object)$previous).hashCode());
        return result;
    }

    public String toString() {
        return "Pathfinder.Node(position=" + String.valueOf(this.getPosition()) + ", previous=" + String.valueOf(this.getPrevious()) + ")";
    }
}
