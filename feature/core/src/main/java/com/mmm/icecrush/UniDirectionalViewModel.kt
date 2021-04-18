package com.mmm.icecrush

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

interface UniDirectionalViewModel<EVENT, EFFECT, STATE> {
    val state: StateFlow<STATE>
    val effect: Flow<EFFECT>
    fun event(event: EVENT)
}

