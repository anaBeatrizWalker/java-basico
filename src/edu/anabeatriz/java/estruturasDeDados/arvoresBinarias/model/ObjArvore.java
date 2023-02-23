package edu.anabeatriz.java.estruturasDeDados.arvoresBinarias.model;

public abstract class ObjArvore<T> implements Comparable<T> {
    
    public abstract boolean equals(Object obj);
    
    public abstract int hashCode();

    public abstract int compareTo(T outro);

    public abstract String toString();
}
