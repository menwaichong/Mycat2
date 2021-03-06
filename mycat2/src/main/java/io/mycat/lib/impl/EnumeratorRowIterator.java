package io.mycat.lib.impl;

import io.mycat.api.collector.AbstractObjectRowIterator;
import io.mycat.api.collector.RowBaseIterator;
import io.mycat.beans.mycat.MycatRowMetaData;
import org.apache.calcite.linq4j.Enumerator;

import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

public class EnumeratorRowIterator extends AbstractObjectRowIterator {
    protected final MycatRowMetaData mycatRowMetaData;
    protected final Enumerator<Object[]> iterator;

    public EnumeratorRowIterator(MycatRowMetaData mycatRowMetaData, Enumerator<Object[]> iterator) {
        this.mycatRowMetaData = mycatRowMetaData;
        this.iterator = iterator;
    }

    @Override
    public MycatRowMetaData metaData() {
        return mycatRowMetaData;
    }

    @Override
    public boolean next() {
        if (this.iterator.moveNext()) {
            this.currentRow = this.iterator.current();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void close() {
        iterator.close();
    }

}