package shared;

import java.util.Objects;

/**
 * @author Ahmed Nabil
 */
public class Pair<V1, V2> {
    V1 v1;
    V2 v2;
    public Pair(V1 v1, V2 v2 ) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(v1, pair.v1) && Objects.equals(v2, pair.v2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2);
    }
}
