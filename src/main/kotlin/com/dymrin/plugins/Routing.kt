package com.dymrin.plugins

import com.dymrin.room.RoomController
import com.dymrin.routes.chatSocket
import com.dymrin.routes.getAllMessages
import io.ktor.application.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing){
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
