package com.derbysoft.quill

import java.util.Date

object data extends App {
  private val user: Option[User] = UserService.findById(2)
  println(user)
  //  private val value: User = UserService.save(User(None, new Date(), new Date(), "drc", "123", null))
  //  println(value)
}
