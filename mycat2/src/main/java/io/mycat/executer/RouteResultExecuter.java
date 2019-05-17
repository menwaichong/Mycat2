//package io.mycat.executer;
//
//import io.mycat.proxy.MycatSessionView;
//import io.mycat.proxy.session.MycatSession;
//import io.mycat.router.ResultRoute;
//import io.mycat.router.routeResult.GLOBAL_TABLE_WRITE_RESULT_ROUTE;
//import io.mycat.router.routeResult.MySQLCommandRouteResultRoute;
//import io.mycat.router.routeResult.ONE_SERVER_RESULT_ROUTE;
//import io.mycat.router.routeResult.SubTableResultRoute;
//import io.mycat.router.routeResult.dbResultSet.DbResultSet;
//import java.io.IO_EXCEPTION;
//
///**
// * @author jamie12221
// * @date 2019-05-07 13:58
// *
// * 根据不同的路由结果处理
// **/
//public enum RouteResultExecuter implements ResultRoute.Executer<MycatSessionView> {
//  INSTANCE;
//
//  @Override
//  public void run(DbResultSet dbResultSet, MycatSessionView mycatSession) {
//
//  }
//
//  @Override
//  public void run(ONE_SERVER_RESULT_ROUTE dbResultSet, MycatSessionView mycatSession)
//      throws IO_EXCEPTION {
//    mycatSession.switchDataNode(dbResultSet.getDataNode());
////    MySQLPacketExchanger.INSTANCE.handle(mycatSession, false);
//  }
//
//  @Override
//  public void run(GLOBAL_TABLE_WRITE_RESULT_ROUTE dbResultSet, MycatSession mycatSession) {
//
//  }
//
//  @Override
//  public void run(MySQLCommandRouteResultRoute dbResultSet, MycatSession mycatSession) {
//
//  }
//
//  @Override
//  public void run(SubTableResultRoute dbResultSet, MycatSession mycatSession) {
//
//  }
//}
