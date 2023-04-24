package oop_principles.abstraction.practice;

public interface Interface5 extends Interface2, Interface3, Interface4 {
    void method5();
  // 2, 3 and 4 are child of Interface5... 2 is already extends to 1
  // Therefore, Interface1 is to parent of all of them.
  // Interface2 extends to Interface1 (Interface1 is to parent of Interface2).
}

