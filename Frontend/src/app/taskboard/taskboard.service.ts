import { Injectable } from '@angular/core';
import { Task } from './taskboard.model';
import { Observable, of } from 'rxjs';
import { delay } from 'rxjs/operators';


@Injectable()
export class TaskBoardService {

    constructor() { }

    public tasks: Task[] = [
        new Task(
            1,
            'Arnaldo Martins',
            'Obter uma CNH para atuar como Rappi',
            'Junho 2019',
            'Jéssica Martins',
            'assets/img/portrait/small/avatar-s-3.png',
            'New'),
        new Task(
            2,
            'Ricardo Teixeira',
            'Comprar uma bicicleta para atuar no Rappi',
            'Junho 2019',
            'Ricardo Teixeira',
            'assets/img/portrait/small/avatar-s-3.png',
            'New'),
        new Task(
            3,
            'Marcos Silva',
            'Comprar medicamentos para controle de diabetes',
            'Junho 2019',
            'Marcos Silva',
            'assets/img/portrait/small/avatar-s-3.png',
            'New'),
        new Task(
            4,
            'Amanda Castro',
            'Comprar uma moto para atuar no Uber Eats',
            'Junho 2019',
            'Amanda Castro',
            'assets/img/portrait/small/avatar-s-1.png',
            'In-Process'),
        new Task(
            5,
            'Janete Alencar',
            'Realizar um curso profissionalizante de Enfermagem',
            'Junho 2019',
            'Janete Alencar',
            'assets/img/portrait/small/avatar-s-1.png',
            'In-Process'),
        new Task(
            7,
            'Kelly Amaral',
            'Realizar uma viagem para o Ceará',
            'Maio 2019',
            'Kelly Amaral',
            'assets/img/portrait/small/avatar-s-5.png',
            'Pending'),
        new Task(
            10,
            'Sara Pereira',
            'Adquirir uma bicicleta para atuar no iFood',
            'Maio 2019',
            'Sara Pereira',
            'assets/img/portrait/small/avatar-s-7.png',
            'Completed'),
        new Task(
            11,
            'Arnaldo Luz',
            'Gravar um CD de sua banda',
            'Maio 2019',
            'Arnaldo Luz',
            'assets/img/portrait/small/avatar-s-7.png',
            'Completed'),
        new Task(
            12,
            'Luciano Pereira',
            'Obter uma CNH para atuar como UBER',
            'Maio 2019',
            'Luciano Pereira',
            'assets/img/portrait/small/avatar-s-7.png',
            'Completed')
    ];


   addNewTask(title: string, message: string) {
        let task: Task = {
            taskId: Math.round(Math.random() * 10000000000),
            taskTitle: title,
            taskMessage: message,
            createdOn: 'Nov 12',
            createdBy: 'Elizabeth Elliott',
            assignedTo: 'assets/img/portrait/small/avatar-s-3.png',
            status: 'New'
        }
        this.tasks.unshift(task);
    return of(this.tasks.slice()).pipe(delay(100));
        
    }
    UpdateTask(task: Task, index: number) {
        // this.tasks.splice(index, 1, task);
        this.tasks = this.tasks.map(i => {
            if(i.taskId === task.taskId) {
              return Object.assign({}, i, task);
            }
            return i;
          })
          return of(this.tasks.slice()).pipe(delay(1000));
    }
    deleteTask(index: number) {
        this.tasks.splice(index, 1);
        return of(this.tasks.slice()).pipe(delay(100));
    }

}