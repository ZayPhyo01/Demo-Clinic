package com.demo_clinic.democlinic.mapper;

abstract class UniMapper<F , T> {
    abstract T map (F item);
}
