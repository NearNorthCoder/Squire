/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.pf4j.DependencyResolver$DependenciesNotFoundException
 */
package net.runelite.client.plugins;

import com.google.common.collect.Multimap;
import java.util.List;
import org.pf4j.DependencyResolver;

public final class MissingDependenciesException
extends DependencyResolver.DependenciesNotFoundException {
    private final Multimap<String, String> reverseDependencyMap;

    public MissingDependenciesException(List<String> dependencies, Multimap<String, String> reverseDependencyMap) {
        super(dependencies);
        this.reverseDependencyMap = reverseDependencyMap;
    }

    public Multimap<String, String> getReverseDependencyMap() {
        return this.reverseDependencyMap;
    }

    public String toString() {
        return "MissingDependenciesException(reverseDependencyMap=" + String.valueOf(this.getReverseDependencyMap()) + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MissingDependenciesException)) {
            return false;
        }
        MissingDependenciesException other = (MissingDependenciesException)((Object)o);
        if (!other.canEqual((Object)this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Multimap<String, String> this$reverseDependencyMap = this.getReverseDependencyMap();
        Multimap<String, String> other$reverseDependencyMap = other.getReverseDependencyMap();
        return !(this$reverseDependencyMap == null ? other$reverseDependencyMap != null : !((Object)this$reverseDependencyMap).equals(other$reverseDependencyMap));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MissingDependenciesException;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = super.hashCode();
        Multimap<String, String> $reverseDependencyMap = this.getReverseDependencyMap();
        result = result * 59 + ($reverseDependencyMap == null ? 43 : ((Object)$reverseDependencyMap).hashCode());
        return result;
    }
}

