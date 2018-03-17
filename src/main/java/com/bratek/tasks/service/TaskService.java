package com.bratek.tasks.service;

import com.bratek.tasks.domain.Task;

public interface TaskService {
    Iterable<Task> list();
}
