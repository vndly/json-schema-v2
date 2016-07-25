package com.mauriciotogneri.jsonschema.attributes;

import com.mauriciotogneri.jsonschema.json.JsonField;
import com.mauriciotogneri.jsonschema.json.JsonValueNumber;

public class Minimum<N extends Number> implements Attribute
{
    private final Number value;

    public Minimum(N value)
    {
        this.value = value;
    }

    @Override
    public JsonField json()
    {
        return new JsonField("minimum", new JsonValueNumber(value));
    }
}