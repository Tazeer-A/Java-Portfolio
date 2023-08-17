package com.example;

import akka.actor.AbstractActor;
import akka.actor.Props;



public class ActorA extends AbstractActor {

    public static Props props() {
        return Props.create(ActorA.class, ActorA::new);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(Deposit.class, this::onMessageA)
                .match(Withdrawal.class, this::onMessageB)
                .build();
    }

    private void onMessageA(Deposit msg) {
        var balance: Big Decimal = 0.0
        var maximumBalance: Big Decimal = 0.0
        case m: Deposit => {
            if (m.amt+balance > maximumBalance){ // Exceed maximum balance allowance
                println("Operation is not allowed: exceeded maximum balance allowance")
            }
            else {  // update balance
                balance = balance + m.amt
            }
        }


    }
        case m: ConfigMaxBalanceAllowance => maximumBalance = m.maxBalance
        case m: GetMaxBalanceAllowance => sender() ! maximumBalance // reply message back to sender
        case m: GetBalance => sender() ! balance // reply balance back to sender
        case _ => println("Invalid message")

        acc ! ConfigMaxBalanceAllowance(2500.00) // set maximum allowance
        acc ! Deposit(400.00)
        acc ! Deposit(2600.00)

    private void onMessageB(Withdrawal msg) {
        var balance = 0.0
        var maximumBalance = 0.0
        case m: Withdrawal => {
        if (m.amt > balance){ // Not enough money
            println("Operation is not allowed: not enough money")
        }
        else { // update balance
            balance = balance - m.amt
        }
    }

    }
        case m: ConfigMaxBalanceAllowance => maximumBalance = m.maxBalance
        case m: GetMaxBalanceAllowance => sender() ! maximumBalance // reply message back to sender
        case m: GetBalance => sender() ! balance // reply balance back to sender
        case _ => println("Invalid message")

        acc ! ConfigMaxBalanceAllowance(2500.00) // set maximum allowance
        acc ! Withdrawal(200.00)
        acc ! WithdrawMoney(105.00)

