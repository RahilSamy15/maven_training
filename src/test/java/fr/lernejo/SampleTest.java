package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    final Sample sample = new Sample();
 @Test
 void addFunc(){
     int res=sample.op(Sample.Operation.ADD,1,1);
     assertThat(res).isEqualTo(2);
 }

 @Test
 void multFunc(){
     int res = sample.op(Sample.Operation.MULT,2,2);
     assertThat(res).isEqualTo(4);
 }
}
