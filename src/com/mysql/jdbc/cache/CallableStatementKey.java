package com.mysql.jdbc.cache;

/**
 *
 */
public class CallableStatementKey {

    public CallableStatementKey(String aSql, String aCatalog, boolean aFunctionCall) {
        theSql = aSql;
        theCatalog = aCatalog;
        theIsFunctionCall = aFunctionCall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CallableStatementKey that = (CallableStatementKey) o;

        if (theIsFunctionCall != that.theIsFunctionCall) return false;
        if (theCatalog != null ? !theCatalog.equals(that.theCatalog) : that.theCatalog != null) return false;
        if (theSql != null ? !theSql.equals(that.theSql) : that.theSql != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = theSql != null ? theSql.hashCode() : 0;
        result = 31 * result + (theCatalog != null ? theCatalog.hashCode() : 0);
        result = 31 * result + (theIsFunctionCall ? 1 : 0);
        return result;
    }

    private final String theSql;
    private final String theCatalog;
    private final boolean theIsFunctionCall;
}
