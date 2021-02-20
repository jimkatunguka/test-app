package com.example.testcontroller.service.impl;

import com.example.testcontroller.model.Widget;
import com.example.testcontroller.service.WidgetService;

import java.util.List;
import java.util.Optional;

public class WidgetServiceImpl implements WidgetService {
    @Override
    public Optional<Widget> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Widget> findAll() {
        return null;
    }

    @Override
    public Widget save(Widget widget) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
