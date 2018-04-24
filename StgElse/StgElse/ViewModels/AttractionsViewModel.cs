using StgElse.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace StgElse.ViewModels
{
    public class AttractionsViewModel
    {
        public List<Attractions> Attractions { get; set; }
        public Attractions Selected { get; set; }
    }
}
