package com.mjukvare.demos.webapp;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class ExperimentTest {

    @Test
    void demo() {
        System.out.println("hello");
        assertThat(true).isTrue();
    }
}
