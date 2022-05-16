package br.edu.ifpb.padroes.realstatev2.payment;

import br.edu.ifpb.padroes.realstatev2.domain.Property;

public abstract class BasePaymentProcessor implements PaymentProcessor{
    protected PaymentProcessor next;

    @Override
    public PaymentProcessor linkWith(PaymentProcessor paymentProcessor) {
        this.next = paymentProcessor;
        return this.next;
    }

    public abstract void process(Property property);

    protected void checkNext(Property property){
        if(this.next != null) {
            this.next.process(property);
        }
    }
}
