package com.derbysoft.quill

import java.util.Date

case class User(id: Long, createTime: Date, updateTime: Date, name: String, passwordHash: String, workPhone: String)


object UserService extends BaseTrait {

  import ctx._;

  def findByUserName(name: String) = {
    val sql = quote {
      query[User].filter(_.name == lift(name))
    }
    ctx.run(sql)
  }


  def save(user: User) = {
    val sql = quote {
      query[User].insert(liftCaseClass(user)).returning(f => f)
    }
    val entityId: Long = ctx.run(sql)
    user.copy(id = entityId)
  }

  def update(user: User) = {

  }

  def findById(id: Long) = {
    val sql = quote {
      query[User].filter(_.id == lift(id))
    }
    ctx.run(sql).headOption
  }


}