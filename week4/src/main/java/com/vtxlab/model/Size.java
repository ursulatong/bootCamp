package com.vtxlab.model;

public enum Size {

  SMALL('S'), MEDIUM('M'), LARGE('L');

  char letterSize;

  Size(char letterSize) {
    this.letterSize = letterSize;
  }
}
